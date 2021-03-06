package CleanCycle.Analytics;

import java.io.Serializable;

public class EdgeComplete implements Serializable {
    public final long ID;
    public final long WayID;
    /* These are the IDs of the nodes at each end of the edge. */
    public final Node node1;
    public final Node node2;
    public final double Distance;
    public double Pollution;

    static final long serialVersionUID = 1L;

    public EdgeComplete(long ID_, long wayID_, Node node1_, Node node2_, double dist_, double pollution_) {
        ID = ID_;
        WayID = wayID_;
        node1 = node1_;
        node2 = node2_;
        Distance = dist_;
        Pollution = pollution_;
    }
}
