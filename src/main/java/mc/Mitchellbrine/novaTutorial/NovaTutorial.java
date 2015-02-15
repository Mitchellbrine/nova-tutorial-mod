package mc.Mitchellbrine.novaTutorial;

import nova.core.block.BlockManager;
import nova.core.item.ItemManager;
import nova.core.loader.Loadable;
import nova.core.loader.NovaMod;
import nova.core.render.RenderManager;

/**
 * Created by Mitchellbrine on 2015.
 */
@NovaMod(id = "NovaTutorial",name = "Nova Tutorial",version = "0.1",novaVersion = "0.1")
public class NovaTutorial implements Loadable {

	public BlockManager blockManager;
	public ItemManager itemManager;
	public RenderManager renderManager;

	public NovaTutorial(BlockManager bManager, ItemManager iManager, RenderManager rManager) {
		this.blockManager = bManager;
		this.itemManager = iManager;
		this.renderManager = rManager;
	}

	@Override
	public void preInit() {
		System.out.println("Hello World!");
	}

}
