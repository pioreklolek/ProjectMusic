package org.example.music;

import org.example.DatabaseConnection;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class DatabaseTest {
    @BeforeAll
    static void connectDatabase() {
        DatabaseConnection.connect("songs.db", "songs.db");
    }

    @AfterAll
    static void disconnectDatabase() {
        DatabaseConnection.disconnect("songs.db");
    }

    @Test
    static void songErrorIndex() {
        //Optional<Song> read(int id)
    }
}
