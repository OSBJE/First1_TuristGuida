package tourism.service;


import org.springframework.stereotype.Service;
import tourism.model.TouristAttraction;
import tourism.repository.TouristRepository;

import java.util.List;

@Service
public class TouristService {

    private final TouristRepository touristRepository;

    public TouristService(){
        this.touristRepository = new TouristRepository();
    }


    public void addTouristAttraction(String name, String description){
        touristRepository.addTouristAttraction(name, description);
    }

    public List<TouristAttraction> allTouristAttractions(){
        return touristRepository.getListOfAttractions();
    }


}
