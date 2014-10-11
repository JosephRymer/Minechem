package minechem.tick;

import java.util.Map;
import minechem.item.MinechemChemicalType;

public class ChemicalFluidReactionOutput {
	
	public final Map<MinechemChemicalType, Float> outputs;
	public final float explosionLevel;
	
	/**
	 * The key of outputs is a chemical, the value of outputs is chance.
	 * If explosionLevel==Float.NaN, then it will not explode.
	 * 
	 * @param outputs
	 * @param explosionLevel
	 */
	public ChemicalFluidReactionOutput(Map<MinechemChemicalType, Float> outputs,float explosionLevel) {
		this.outputs = outputs;
		this.explosionLevel = explosionLevel;
	}
	
}
