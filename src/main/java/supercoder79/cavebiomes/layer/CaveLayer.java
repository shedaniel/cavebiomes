package supercoder79.cavebiomes.layer;

import supercoder79.cavebiomes.magic.LayerRandom;

public abstract class CaveLayer {
    public abstract int operate(LayerRandom random, int parent, int x, int z);
}
