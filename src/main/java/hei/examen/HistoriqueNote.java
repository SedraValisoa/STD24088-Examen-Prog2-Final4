package hei.examen;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HistoriqueNote {
    private static HistoriqueNote instance;

    private Map<Integer, NavigableMap<Instant, Double>> data = new HashMap<>();

    private HistoriqueNote() {}

    public static HistoriqueNote getInstance() {
        if (instance == null) {
            instance = new HistoriqueNote();
        }
        return instance;
    }

    public void setNote(int id, Instant dateDebut, double note) {
        data.putIfAbsent(id, new TreeMap<>());
        data.get(id).put(dateDebut, note);
    }

    public double getnote(int id, Instant date) {
        NavigableMap<Instant, Double> historique = data.get(id);
        if (historique == null) {
            throw new IllegalArgumentException("Aucun note trouvé pour le id " + id);
        }
        Entry<Instant, Double> entry = historique.floorEntry(date);
        if (entry == null) {
            throw new IllegalArgumentException("Aucun note défini avant cet instant pour " + id);
        }
        return entry.getValue();
    }
}