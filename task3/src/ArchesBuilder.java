
public class ArchesBuilder implements ILineStep {

	@Override
	public IProductPart buildProductPart() {
		System.out.println("Making arches");
		return (IProductPart) new Arches();
	}
}
