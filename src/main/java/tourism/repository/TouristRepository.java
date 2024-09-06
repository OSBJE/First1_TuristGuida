package tourism.repository;

import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSOutput;
import tourism.model.TouristAttraction;
import tourism.service.TouristService;

import java.sql.SQLOutput;
import java.util.*;

@Repository
public class TouristRepository {


    private List<TouristAttraction> listOfAttractions;

    public TouristRepository(){
        populateTouristList();
    }

    private void populateTouristList(){
        listOfAttractions.add(new TouristAttraction("Rundtårn", "Det er et tårn som er rundt"));
        listOfAttractions.add(new TouristAttraction("Lille havfrue", "Chinks er vilde med hende"));
        listOfAttractions.add(new TouristAttraction("Rosenborg", "Et flot slot, hvor den dansk kongefamile holder til"));
    }


    public void addTouristAttraction(String name, String description){
        listOfAttractions.add(new TouristAttraction(name, description));
    }

    public List<TouristAttraction> getListOfAttractions() {
        return listOfAttractions;
    }

    public TouristAttraction getAttraction(String name){
        TouristAttraction attraction = null;
        for (TouristAttraction obj : listOfAttractions){
            if (name == obj.getName()){
                attraction = obj;
            }
        }

        return attraction;
    }

    public String deleteAttraction(String name){
        String deleteAttraction = "Not object was deleted";
        for (TouristAttraction obj : listOfAttractions){
            if (name == obj.getName()){
                listOfAttractions.remove(obj);
                deleteAttraction = obj.getName() + " was deleted";
            }
        }

        return deleteAttraction;
    }

}
