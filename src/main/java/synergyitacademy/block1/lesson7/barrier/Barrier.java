package synergyitacademy.block1.lesson7.barrier;

import synergyitacademy.block1.lesson7.sportsman.Sportsman;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

     public abstract boolean action(Sportsman sportsman);


}
