
public class HullBuilder implements ILineStep {

	@Override
	public IProductPart buildProductPart() {
		System.out.println("Making hull");
		return (IProductPart) new Hull();
	}
}
