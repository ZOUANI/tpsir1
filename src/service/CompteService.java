/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import java.util.List;
import util.SearchUtil;

/**
 *
 * @author YOUNES
 */
public class CompteService extends AbstractFacade<Compte> {

    public int initBd() {
        for (int i = 0; i < 10; i++) {
            Compte compte = new Compte("EE" + i, i * 100);
            create(compte);
        }
        return 1;
    }

    public int debiter(String id, double montant) {
        Compte compte = find(id);
        if (compte == null) {
            return -1;
        } else {
            compte.setSolde(compte.getSolde() + montant);
            edit(compte);
            return 1;
        }
    }

    public List<Compte> findByCriteria(String rib, Double soldeMin, Double soldeMax) {
        String query = "SELECT c FROM Compte c WHERE 1";
        query += SearchUtil.addConstraintMinMax("c", "solde", soldeMin, soldeMax);
        return getEntityManager().createQuery(query).getResultList();
    }

    public int crediter(String id, double montant) {
        Compte compte = find(id);
        if (compte == null) {
            return -1;
        } else {
            double nvSolde = compte.getSolde() - montant;
            if (nvSolde < 0) {
                return -2;
            } else {
                compte.setSolde(nvSolde);
                edit(compte);
                return 2;
            }
        }
    }

    public CompteService() {
        super(Compte.class);
    }

}
