package modele.Instance;

import modele.environnement.varietes.Varietes;

import java.util.HashMap;

public class Magasin {
    private static Magasin instance = null;

    private HashMap<Varietes, Integer> prixVente = new HashMap<>();

    private Magasin(){
        prixVente.put(Varietes.salade, 5);
        prixVente.put(Varietes.carotte, 3);
        prixVente.put(Varietes.pasteque, 10);
    }

    public static Magasin getMagasin(){
        if(instance == null)
            instance = new Magasin();
        return instance;
    }

    public int getPrixVente(Varietes v){
        return prixVente.get(v);
    }
}
