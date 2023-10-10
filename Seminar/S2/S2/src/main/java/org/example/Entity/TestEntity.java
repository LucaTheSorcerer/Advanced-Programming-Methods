package org.example.Entity;
import org.junit.jupiter.api.Test;
import io.vavr.collection.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestEntity {

    @Test
    public void testEntityConstructor() {
        Entity entity = new Entity("New Entity", 2.0, true);
        assertEquals("New Entity", entity.getName());
        assertEquals(2.0, entity.getWeight());
        assertTrue(entity.canCut());

        assertThrows(IllegalArgumentException.class, () -> {
            new Entity("New Entity", -2.0, true);
        });
    }

    @Test
    public void testFilter() {
        List<Entity> entities = List.of(
                new Entity("Entity 1", 1.0, true),
                new Entity("Entity 2", 2.0, false),
                new Entity("Entity 3", 3.0, true)
        );

        List<Entity> filteredEntities = Filter.filter(entities);
        assertEquals(2, filteredEntities.size());
        assertTrue(filteredEntities.forAll(entity -> entity.getWeight() > 1.0));
    }

    @Test
    public void testCanCut() {
        List<Entity> entities = List.of(
                new Entity("Entity 1", 1.0, true),
                new Entity("Entity 2", 2.0, false),
                new Entity("Entity 3", 3.0, true)
        );

        List<Entity> canCutEntities = Filter.canCut(entities);
        assertEquals(2, canCutEntities.size());
        assertTrue(canCutEntities.forAll(Entity::canCut));
    }
}
