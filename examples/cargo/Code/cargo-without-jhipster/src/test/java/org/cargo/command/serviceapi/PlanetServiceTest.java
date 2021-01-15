package org.cargo.command.serviceapi;

/**
 * Spring based transactional test with DbUnit support.
 */
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.cargo.command.domain.Planet;
import org.sculptor.framework.test.AbstractDbUnitJpaTests;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Spring based transactional test with DbUnit support.
 */
public class PlanetServiceTest extends AbstractDbUnitJpaTests implements PlanetServiceTestBase {

    @Autowired
    protected PlanetService planetService;

    @Test
    public void testFindById() throws Exception {
        Planet earth = planetService.findById(getServiceContext(), 1L);
        assertEquals("Earth", earth.getName());
    }

    @Test
    public void testFindAll() throws Exception {
        List<Planet> result = planetService.findAll(getServiceContext());
        assertEquals(2, result.size());
    }

    @Test
    public void testSave() throws Exception {
        Planet earth = planetService.findById(getServiceContext(), 1L);
        int diameterBefore = earth.getDiameter();
        earth.setDiameter(diameterBefore + 100);
        planetService.save(getServiceContext(), earth);
        earth = planetService.findById(getServiceContext(), 1L);
        assertEquals(diameterBefore + 100, earth.getDiameter());
    }

    @Test
    public void testDelete() throws Exception {
        int planetsBefore = countRowsInTable(Planet.class);
        Planet earth = planetService.findById(getServiceContext(), 1L);
        planetService.delete(getServiceContext(), earth);
        int planetsAfter = countRowsInTable(Planet.class);
        assertEquals(planetsBefore - 1, planetsAfter);
    }

}

