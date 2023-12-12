package mr.iscae.service;

import mr.iscae.entity.Company;
import mr.iscae.entity.Server;
import mr.iscae.repositrie.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServerService {
    @Autowired
    private ServerRepository serverRepository;
    public List<Server> findAll(){
        return serverRepository.findAll();
    }
    public Server create(Server server){
        return serverRepository.save(server);
    }
    public Boolean delete(Long id){
        Optional<Server> serverOptional=serverRepository.findById(id);
        if(serverOptional.isPresent()){
            serverRepository.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }
}
