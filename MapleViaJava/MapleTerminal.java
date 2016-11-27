import com.maplesoft.openmaple.*;
import com.maplesoft.externalcall.MapleException;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MapleTerminal {

    private static MapleTerminal instance = null;
    private String a[];
    private Engine t;
    private String answer;
    private PrintStream dummyStream;

    private MapleTerminal(){
        try{
            a = new String[1];
            a[0] = "java";
            t = new Engine( a, new EngineCallBacksDefault(), null, null ); // Mozna uruchomić tylko jeden silnik naraz (dlatego singleton)
            dummyStream = new PrintStream(new OutputStream() { // evaluate jest napisane tak, ze wypisuje wynik, dummy stream sluzy do blokowania tego
                @Override
                public void write(int b) throws IOException {

                }
            });
        }
        catch (MapleException e){
            System.out.println(e.getMessage());
        }
    }

    public static MapleTerminal getInstance(){
        if (instance == null) instance = new MapleTerminal();
        return instance;
    }

    public String evaluate(String query){
        try{
            PrintStream originalStream = System.out;
            System.setOut(dummyStream);
            answer = String.valueOf(t.evaluate(query));
            System.setOut(originalStream);
        }
        catch (MapleException e){ // lapie wyjatki prosto z Maple
            answer = e.getMessage();
        }
        return answer;
    }

}
