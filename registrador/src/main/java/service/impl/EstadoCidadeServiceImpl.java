package service.impl;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.registrador.model.Cidade;
import com.registrador.model.Estado;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import repository.CidadeRepository;
import repository.EstadoRepository;
import service.EstadoCidadeService;

public class EstadoCidadeServiceImpl implements EstadoCidadeService{
    
    private String JSON_PATH =  "C:\\Users\\giova\\Desktop\\Giovanni\\unimed\\registrador\\src\\main\\resources\\json\\estado_cidade.json";

    @Autowired
	private CidadeRepository cidadeRepository;

    @Autowired
	private EstadoRepository estadoRepository;

    @Override
	public List<Cidade> buscaCidadesPorId(Estado estado){
        List<Cidade> cidades = cidadeRepository.findByEstado(estado);
        return cidades;
    }

    @Override
    public Estado buscaEstado(Long id) {
        Optional<Estado> estado = estadoRepository.findById(id);
        return estado.get();
    }

    @Override
    public void populaDadosBanco() throws Exception{
        //TODO: Verificacao se banco de dados esta vazio
        
        try {
            
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(JSON_PATH));
            Map<?, ?> map = gson.fromJson(reader, Map.class);
           
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
            reader.close();
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

}


