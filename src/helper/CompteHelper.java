/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Compte;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author YOUNES
 */
public class CompteHelper extends AbstractHelper<Compte>{
   private static AbstractHelperItem[] titres;

    static {
        titres = new AbstractHelperItem[]{
            new AbstractHelperItem("RA9EM AL 7ISSAB ", "id"),
            new AbstractHelperItem("A RASSIDE", "solde")};

    }

    public CompteHelper(JTable jTable, List<Compte> list) {
        super(titres, jTable, list);
    }

    public CompteHelper(AbstractHelperItem[] abstractHelperItem, JTable jTable) {
        super(titres, jTable);
    }

    public CompteHelper(JTable jTable) {
        super(titres, jTable);
    }
}
