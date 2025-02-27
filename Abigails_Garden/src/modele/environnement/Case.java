/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.environnement;

import modele.SimulateurDate;
import modele.SimulateurPotager;
import modele.environnement.meteo.SimulateurMeteo;

public abstract class Case implements Runnable {
    protected SimulateurPotager simulateurPotager;
    protected SimulateurDate simulateurDate;
    protected SimulateurMeteo simulateurMeteo;

    private int précipitations; // TODO : mis à jour par le simulateur de météo pour chaque case ()
    private int ensolleillement;

    
    public Case(SimulateurPotager _simulateurPotager, SimulateurDate _simulateurDate, SimulateurMeteo _simulateurMeteo) {
        simulateurPotager = _simulateurPotager;
        simulateurDate = _simulateurDate;
        simulateurMeteo = _simulateurMeteo;
    }

    public abstract void actionUtilisateur(Action typeAction);


  }
