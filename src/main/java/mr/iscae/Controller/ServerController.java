package mr.iscae.Controller;
import mr.iscae.entity.Server;
import mr.iscae.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/server")
public class ServerController {
    @Autowired
    private ServerService serverService;
    @PostMapping("/create")
    public ResponseEntity<Server> create(@RequestBody Server server){
        return ResponseEntity.status(HttpStatus.CREATED).body(serverService.create(server));
    }
    @GetMapping("all")
    public ResponseEntity<List<Server>> getAllServer(){
        return ResponseEntity.status(HttpStatus.OK).body(serverService.findAll());
    }


}
