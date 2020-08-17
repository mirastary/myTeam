package org.acme.config;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeMyTeamIT extends MyTeamTest {

    // Execute the same tests but in native mode.
}