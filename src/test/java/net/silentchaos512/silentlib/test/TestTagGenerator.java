package net.silentchaos512.silentlib.test;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.silentchaos512.lib.util.generator.TagGenerator;
import org.junit.Test;

public class TestTagGenerator {
    @Test
    public void testTagGen() {
        TagGenerator.item(new ResourceLocation("silentlib", "test_tag"), "silentlib:test_item");
        TagGenerator.item(new ResourceLocation("silentlib", "test_tag"), "#forge:ores/iron");
        TagGenerator.block(new ResourceLocation("forge", "ores/test"), "silentlib:test_block");
        TagGenerator.block(new ResourceLocation("forge", "ores/test"), "#silentlib:test_tag");
        TagGenerator.block(new ResourceLocation("forge", "ores/test"), Tags.Blocks.DIRT);
        TagGenerator.generateFiles();
    }
}