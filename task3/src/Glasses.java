
public class Glasses implements IProduct {
	private IProductPart firstPart;
	private IProductPart secondPart;
	private IProductPart thirdPart;

	@Override
	public void installFirstPart(IProductPart part) {
		System.out.println("Installing first part");
		this.firstPart = part;

	}

	@Override
	public void installSecondPart(IProductPart part) {
		System.out.println("Installing second part");
		this.secondPart = part;

	}

	@Override
	public void installThirdPart(IProductPart part) {
		System.out.println("Installing third part");
		this.thirdPart = part;

	}

}
