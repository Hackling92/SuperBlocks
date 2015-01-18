// Date: 1/18/2015 2:27:56 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.totallyminecraft.superblocks.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBatteryCharger extends ModelBase
{
  //fields
    ModelRenderer Box1;
  
  public ModelBatteryCharger()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Box1 = new ModelRenderer(this, 0, 0);
      Box1.addBox(0F, 0F, 0F, 10, 4, 8);
      Box1.setRotationPoint(-5F, 20F, -2F);
      Box1.setTextureSize(64, 64);
      Box1.mirror = true;
      setRotation(Box1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Box1.render(f5);
  }

  public void renderModel(float f){
    Box1.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}