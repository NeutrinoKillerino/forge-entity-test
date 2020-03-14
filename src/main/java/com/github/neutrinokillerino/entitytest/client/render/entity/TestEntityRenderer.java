package com.github.neutrinokillerino.entitytest.client.render.entity;

import com.github.neutrinokillerino.entitytest.entity.TestEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;


public class TestEntityRenderer extends EntityRenderer<TestEntity> {
   private static final ResourceLocation TEST_TEXTURES = new ResourceLocation("textures/entity/end_crystal/end_crystal.png");

	private ModelRenderer frame;

	public TestEntityRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn);
		this.shadowSize = 0.0F;
	}

	public void render(TestEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
			IRenderTypeBuffer bufferIn, int packedLightIn) {
		matrixStackIn.push();
		
		this.frame = new ModelRenderer(16, 16, 0, 0);
		
		if (entityIn.shorty) {
			this.frame.addBox(0.0F, 0.0F, 0.0F, 16.0F, 8.0F , 16.0F);
		} else {
			this.frame.addBox(0.0F, 0.0F, 0.0F, 16.0F, 16.0F , 16.0F);			
		}


		// Get poster texture:
		RenderType renderType = RenderType.getEntitySolid(TEST_TEXTURES);
		IVertexBuilder ivertexbuilder = bufferIn.getBuffer(renderType);

		matrixStackIn.push();

		int i = OverlayTexture.NO_OVERLAY;

		this.frame.render(matrixStackIn, ivertexbuilder, packedLightIn, i);

		matrixStackIn.pop();
		matrixStackIn.pop();

		super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
	}

	public ResourceLocation getEntityTexture(TestEntity entity) {
		return TEST_TEXTURES;
	}
}
