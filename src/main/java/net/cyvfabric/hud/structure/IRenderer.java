package net.cyvfabric.hud.structure;

import net.minecraft.client.gui.DrawContext;

public interface IRenderer {
    int getWidth();
    int getHeight();

    public void save(ScreenPosition pos);

    public ScreenPosition load();

    void render(DrawContext context, ScreenPosition pos);

    default void renderDummy(DrawContext context, ScreenPosition pos) {
        render(context, pos);
    }

    default boolean renderInChat() {
        return true;
    }

    default boolean renderInGui() {
        return false;
    }

    default boolean renderInOverlay() {
        return false;
    }

    

}
