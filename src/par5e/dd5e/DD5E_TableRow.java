/*
 * 
 * PAR5E Fantasy Grounds Ruleset Module Parser Tool
 * Developed by Zeus. Copyright 2014
 * 
 */

package par5e.dd5e;

import java.util.Arrays;

/**
 *
 * @author zeph
 */
public class DD5E_TableRow {
    
    public Integer from;
    public Integer to;
    public String[] results;
    
    public DD5E_TableRow(Integer f, Integer t, String[] res) {
        from = f;
        to = t;
        results = res;
    }
    
    public void addResult(String aNew) {
        results = Arrays.copyOf(results, results.length+1);
        results[results.length-1] = aNew;
    }
    
    public String[] getResults() {
        return results;
    }
    
    public String getResult(Integer ref) {
        return results[ref];
    }
    
}
