package com.valleco.ravencrest.entities;

import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.graphics.Texture;
import com.valleco.ravencrest.components.PlayerComponent;
import com.valleco.ravencrest.components.PositionComponent;
import com.valleco.ravencrest.components.RenderComponent;
import com.valleco.ravencrest.components.VelocityComponent;

public class EntityFactory {

    public static Entity createPlayer(float x, float y, Texture texture) {
        Entity entity = new Entity();

        PositionComponent position = new PositionComponent();
        position.position.set(x, y);

        RenderComponent render = new RenderComponent();
        render.texture = texture;

        PlayerComponent player = new PlayerComponent();

        entity.add(position);
        entity.add(render);
        entity.add(player);

        return entity;
    }

    public static Entity createMovingNPC(float x, float y, Texture texture, float velocityX, float velocityY) {
        Entity entity = new Entity();

        PositionComponent position = new PositionComponent();
        position.position.set(x, y);

        RenderComponent render = new RenderComponent();
        render.texture = texture;

        VelocityComponent velocity = new VelocityComponent();
        velocity.velocity.set(velocityX, velocityY); // Definir a velocidade de movimento

        entity.add(position);
        entity.add(render);
        entity.add(velocity);

        return entity;
    }
}
