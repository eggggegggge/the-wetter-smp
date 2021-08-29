//Made with Blockbench
//Paste this code into your mod.

public static class Modelcrab extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;

	public Modelcrab() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -3.0F, -2.0F, 6, 2, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 6, -2.0F, -5.0F, -2.0F, 1, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 6, 1.0F, -5.0F, -2.0F, 1, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 6, 3.0F, -4.5F, -1.0F, 3, 2, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 6, -6.0F, -4.5F, -1.0F, 3, 2, 3, 0.0F, true));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-3.5F, 23.0F, 0.5F);
		setRotationAngle(bone2, 0.6981F, 0.0F, 0.5236F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -0.5F, -0.5F, 0.5F, 1, 2, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -0.5F, -2.5F, -1.5F, 1, 2, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-3.5F, 23.0F, 0.5F);
		setRotationAngle(bone3, 0.6981F, 0.0F, -0.5236F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, 5.5F, 2.0F, -1.5F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, 5.5F, 0.0F, -3.5F, 1, 2, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone4, 0.0F, 0.0F, -2.7925F);
		bone4.cubeList.add(new ModelBox(bone4, 4, 6, 4.3F, 3.0F, -1.0F, 3, 2, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 23.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, 0.0F, 2.7925F);
		bone5.cubeList.add(new ModelBox(bone5, 4, 6, -7.0F, 2.0F, -1.0F, 3, 2, 3, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		bone2.render(f5);
		bone3.render(f5);
		bone4.render(f5);
		bone5.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}