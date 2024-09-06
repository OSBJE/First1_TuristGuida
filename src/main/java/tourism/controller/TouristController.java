package tourism.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tourism.model.TouristAttraction;
import tourism.service.TouristService;

import java.util.List;

@Controller
@RequestMapping("/welcome")
public class TouristController {


    private final TouristService touristService;

    public TouristController(){
        this.touristService = new TouristService();
    }

    // get /attractions list
    @GetMapping("")
    public ResponseEntity<List<TouristAttraction>> getAllTouristAttractions(){
        return new ResponseEntity<>(touristService.allTouristAttractions(), HttpStatus.OK);
    }

    // get /attractions/{name}
    @GetMapping("/attractions/{attractionName}")
    public ResponseEntity<TouristAttraction> getTouristAttraction(@PathVariable String name){
        return null;
    }

    // post /attractions/add
    @PostMapping("/attractions/add")
    public ResponseEntity<TouristAttraction> addTouristAttraction (@RequestBody TouristAttraction attraction){
        return null;
    }

    // post /attractions/update
    @PutMapping("/attractions/{attractionName}")
    public ResponseEntity<TouristAttraction> updateTouristAttraction (@PathVariable String name ){
        return null;
    }

    // post attractions/delete/{name}
    @DeleteMapping("/{attractionName}")
    public ResponseEntity<String> deleteTouristAttraction(@PathVariable String name){

        return null;
    }


}
