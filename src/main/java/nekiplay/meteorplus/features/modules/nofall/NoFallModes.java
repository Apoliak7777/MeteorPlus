package nekiplay.meteorplus.features.modules.nofall;

public enum NoFallModes {
	Matrix_New,
	Vulcan,
	Vulcan_2dot7dot7,
	Elytra_Clip;
	@Override
	public String toString() {
		return super.toString().replace('_', ' ').replaceAll("dot", ".");
	}
}
