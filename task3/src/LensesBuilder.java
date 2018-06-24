
public class LensesBuilder implements ILineStep {

	@Override
	public IProductPart buildProductPart() {
		System.out.println("Making lenses");
		return (IProductPart) new Lenses();
	}
}