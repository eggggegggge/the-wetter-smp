// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelglider extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer wing2;
	private final ModelRenderer wing;
	private final ModelRenderer string;
	private final ModelRenderer bodystraps;

	public Modelglider() {
		textureWidth = 32;
		textureHeight = 48;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		wing2 = new ModelRenderer(this);
		wing2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(wing2);
		setRotationAngle(wing2, 0.0F, 0.0F, 0.7854F);
		wing2.setTextureOffset(16, 8).addBox(-21.5F, -21.0F, 12.0F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		wing2.setTextureOffset(0, 8).addBox(-20.5F, -20.0F, 13.0F, 1.0F, 27.0F, 0.0F, 0.0F, false);
		wing2.setTextureOffset(0, 8).addBox(-19.5F, -19.0F, 13.0F, 1.0F, 26.0F, 0.0F, 0.0F, false);
		wing2.setTextureOffset(0, 8).addBox(-18.5F, -18.0F, 13.0F, 1.0F, 25.0F, 0.0F, 0.0F, false);
		wing2.setTextureOffset(0, 8).addBox(-17.5F, -17.0F, 13.0F, 1.0F, 24.0F, 0.0F, 0.0F, false);
		wing2.setTextureOffset(0, 8).addBox(-16.5F, -16.0F, 13.0F, 1.0F, 23.0F, 0.0F, 0.0F, false);
		wing2.setTextureOffset(0, 8).addBox(-15.5F, -15.0F, 13.0F, 1.0F, 22.0F, 0.0F, 0.0F, false);
		wing2.setTextureOffset(0, 8).addBox(-14.5F, -14.0F, 13.0F, 1.0F, 21.0F, 0.0F, 0.0F, false);
		wing2.setTextureOffset(0, 8).addBox(-13.5F, -13.0F, 13.0F, 1.0F, 20.0F, 0.0F, 0.0F, false);
		wing2.setTextureOffset(0, 8).addBox(-12.5F, -12.0F, 13.0F, 1.0F, 19.0F, 0.0F, 0.0F, false);
		wing2.setTextureOffset(0, 8).addBox(-11.5F, -11.0F, 13.0F, 1.0F, 18.0F, 0.0F, 0.0F, false);
		wing2.setTextureOffset(0, 8).addBox(-10.5F, -10.0F, 13.0F, 1.0F, 17.0F, 0.0F, 0.0F, false);
		wing2.setTextureOffset(0, 8).addBox(-9.5F, -9.0F, 13.0F, 1.0F, 16.0F, 0.0F, 0.0F, false);

		wing = new ModelRenderer(this);
		wing.setRotationPoint(-4.0F, -20.0F, -4.0F);
		body.addChild(wing);
		setRotationAngle(wing, 0.0F, 0.0F, -0.7854F);
		wing.setTextureOffset(0, 8).addBox(8.5F, -3.5F, 17.0F, 1.0F, 27.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(0, 8).addBox(7.5F, -3.0F, 17.0F, 1.0F, 27.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(0, 8).addBox(6.5F, -2.0F, 17.0F, 1.0F, 26.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(0, 8).addBox(5.5F, -1.0F, 17.0F, 1.0F, 25.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(0, 8).addBox(4.5F, 0.0F, 17.0F, 1.0F, 24.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(0, 8).addBox(3.5F, 1.0F, 17.0F, 1.0F, 23.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(0, 8).addBox(2.5F, 2.0F, 17.0F, 1.0F, 22.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(0, 8).addBox(1.5F, 3.0F, 17.0F, 1.0F, 21.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(0, 8).addBox(0.5F, 4.0F, 17.0F, 1.0F, 20.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(0, 8).addBox(-0.5F, 5.0F, 17.0F, 1.0F, 19.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(0, 8).addBox(-1.5F, 6.0F, 17.0F, 1.0F, 18.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(0, 8).addBox(-2.5F, 7.0F, 17.0F, 1.0F, 17.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(0, 8).addBox(-3.5F, 8.0F, 17.0F, 1.0F, 16.0F, 0.0F, 0.0F, false);
		wing.setTextureOffset(16, 10).addBox(9.5F, -4.0F, 16.0F, 1.0F, 27.0F, 1.0F, 0.0F, false);

		string = new ModelRenderer(this);
		string.setRotationPoint(-5.0F, -22.0F, 0.0F);
		body.addChild(string);
		setRotationAngle(string, -0.4363F, 0.0F, 0.0F);
		string.setTextureOffset(5, 27).addBox(4.5F, 0.0F, 3.0F, 1.0F, 1.0F, 11.0F, 0.0F, false);

		bodystraps = new ModelRenderer(this);
		bodystraps.setRotationPoint(-5.0F, -22.0F, 0.0F);
		body.addChild(bodystraps);
		bodystraps.setTextureOffset(20, 15).addBox(4.0F, 2.0F, 2.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		bodystraps.setTextureOffset(14, 40).addBox(1.0F, 7.0F, 2.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		bodystraps.setTextureOffset(0, 41).addBox(1.0F, 1.0F, 2.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		bodystraps.setTextureOffset(16, 9).addBox(4.5F, -9.0F, 12.0F, 1.0F, 27.0F, 1.0F, 0.0F, false);
		bodystraps.setTextureOffset(0, 38).addBox(-10.5F, 8.0F, 12.0F, 31.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}