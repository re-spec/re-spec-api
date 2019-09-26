package org.respec.respecapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.respec.respecapi.domain.Location;
import org.respec.respecapi.infrastructure.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationRepositoryTests {
    @Autowired
    LocationRepository locationRepository;

    @Test
    public void getLocation()
    {
        //locationRepository.save(Location.builder().name("경기도 대왕판교로").build());

        List<Location> locationList = locationRepository.findAll();

        Location user = locationList.get(0);
        assertThat(user.getIdx(), is(1L));
        assertThat(user.getName(), is("경기도 대왕판교로"));
    }
}
