
public class GlassesInstaller implements IAssemblyLine {
	private IProductPart firstPart;
	private IProductPart secondPart;
	private IProductPart thirdPart;

	public GlassesInstaller(IProductPart firstPart, IProductPart secondPart, IProductPart thirdPart) {
		System.out.println("Install in progres");
		this.firstPart = firstPart;
		this.secondPart = secondPart;
		this.thirdPart = thirdPart;
	}

	@Override
	public IProduct assemble(IProduct iProduct) {
		iProduct.installFirstPart(firstPart);
		iProduct.installSecondPart(secondPart);
		iProduct.installThirdPart(thirdPart);

		return iProduct;
	}

}
