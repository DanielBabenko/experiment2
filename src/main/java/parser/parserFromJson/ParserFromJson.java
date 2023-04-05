package parser.parserFromJson;

import model.Coordinates;
import model.LabWork;
import model.Person;
import model.enums.Color;
import model.enums.Difficulty;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import parser.Root;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ParserFromJson {
    public Root parse() {
        Root root = new Root();
        JSONParser parser = new JSONParser();
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("notes.json"))) {

            JSONArray labsJsonArray = (JSONArray) parser.parse(reader);

            HashSet<LabWork> labWorks = new HashSet<>();
            for (Object lab : labsJsonArray) {
                JSONObject labJsonObject = (JSONObject) lab;

                // at the first parsing primitive type of json file
                long id = (Long) labJsonObject.get("id");

                String name = (String) labJsonObject.get("name");
                long minimalPoint = (Long) labJsonObject.get("minimalPoint");
                long tunedInWorks = (Long) labJsonObject.get("tunedInWorks");

                // ENUM parsing
                String difficulty = (String) labJsonObject.get("difficulty");

                // at the second parsing object type of json file
                //Coordinates type
                JSONObject coordinatesJsonObject = (JSONObject) labJsonObject.get("coordinates");
                long x = (Long) coordinatesJsonObject.get("x");
                double y = (Double) coordinatesJsonObject.get("y");

                // Person type
                JSONObject personJsonObject = (JSONObject) labJsonObject.get("author");
                String nameAuthor = (String) personJsonObject.get("name");
                String color = (String) personJsonObject.get("eyeColor");
                double height = (Double) personJsonObject.get("height");
                String dataBirthday = (String) personJsonObject.get("birthday");

                LabWork labWork = new LabWork((int) id, name, (int) minimalPoint, (int) tunedInWorks, Difficulty.valueOf(difficulty), new Coordinates((int) x, y), new Person(nameAuthor, Color.valueOf(color), height, dataBirthday));

                labWorks.add(labWork);

            }

            root.setLabWorkSet(labWorks);

            return root;
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean checkOnEmpty() throws IOException {

        try {
            File file = new File("notes.json");
            BufferedReader br = new BufferedReader(new FileReader(file));

            try {
                if (br.readLine() == null)
                    return false;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            return true;
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }

}
