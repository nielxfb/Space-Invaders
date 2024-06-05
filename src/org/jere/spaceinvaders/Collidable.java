package org.jere.spaceinvaders;

public interface Collidable {

    /**
     * Notification that the entity has collided with something. It's implementation is based on
     * the entity (different entities will react differently to collisions)
     *
     * @param other The entity against which we collided
     */
    public void collidedWith(Entity other);

}
