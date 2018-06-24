
public class Test {
	public static void main(String[] args) {
		System.out.println("Start progress");
		Glasses glasses = new Glasses();
		LensesBuilder lensesBuilder = new LensesBuilder();
		HullBuilder hullBuilder = new HullBuilder();
		ArchesBuilder archesBuilder = new ArchesBuilder();
		GlassesInstaller glassesInstaller = new GlassesInstaller(lensesBuilder.buildProductPart(),hullBuilder.buildProductPart(),archesBuilder.buildProductPart());
		glassesInstaller.assemble(glasses);
		System.out.println("Glasses are created!");
	}
	
}
