package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        int a = 0;
        int b = 0;
        int tmpPointer = 0;
        StringBuilder tmpa = new StringBuilder();
        StringBuilder tmpb = new StringBuilder();
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "MyTeam";
        } else if (query.contains("plus")) {
            for (int i = 0; i < 10; i++) {
                if (query.charAt(15 + i) != '%'){
                    tmpa.append(query.charAt(15 + i));
                } else {
                    tmpPointer = 14 + i;
                    break;
                }
            }
            a = Integer.parseInt(tmpa.toString());
            for (int i = 0; i < 10; i++) {
                if (query.charAt(tmpPointer + i) != '%'){
                    tmpb.append(query.charAt(tmpPointer + i));
                } else {
                    break;
                }
            }
            b = Integer.parseInt(tmpb.toString());
            return String.valueOf(a + b);
        } else {
            return "";
        }
    }
}
