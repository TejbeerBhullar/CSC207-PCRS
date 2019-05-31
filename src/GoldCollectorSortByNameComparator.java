import java.util.Comparator;

public class GoldCollectorSortByNameComparator implements Comparator<GoldCollector> {
    /**
     * TODO: Implement compare method so that it returns:
     *  1 - g1's name is greater than g2's
     * -1 - g1's name is less than g2's
     *  0 - g1's name is equal tp g2's
     *
     * @param g1 first collector
     * @param g2 second collector
     * @return 1, -1 or 0 if g1 is greater, less than or equal to g2.
     */
    @Override
    public int compare(GoldCollector g1, GoldCollector g2) {
        if (g1.name.length() < g2.name.length()){return -1;}
        else if (g1.name.length() == g2.name.length()){return 0;}
        else {return 1;}
    }
}