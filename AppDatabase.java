package com.example.projetandroid;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Emplacement.class, Photos.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract EmplacementDAO emplacementDAO();

    public abstract PhotosDAO photosDAO();

    private static volatile AppDatabase INSTANCE;

    private static final int NUMBER_OF_THREADS = 4;

    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static AppDatabase getDatabase(final Context context) {
        // on ne crée pas le singleton car il existe deja
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                                    context.getApplicationContext(),
                                    AppDatabase.class, "base-nom"
                            ).addCallback(roomCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            Log.d("", "Création du jeu d'essai");

            /*
            INSTANCE.databaseWriteExecutor.execute(() -> {
                INSTANCE.categorieDao().insert(new Categorie(1, "Maison"));
                INSTANCE.categorieDao().insert(new Categorie(2, "Jardin"));
                INSTANCE.tacheDao().insert(new Tache(1, "Peindre les volets", 1));
                INSTANCE.tacheDao().insert(new Tache(2, "Passer la tondeuse", 2));
                INSTANCE.tacheDao().insert(new Tache(3, "Tailler les haies", 2));
                INSTANCE.tacheDao().insert(new Tache(4, "Ranger le garage", 1));
                INSTANCE.tacheDao().insert(new Tache(5, "Cacher les paquets de biscuits", 1));
            });*/
        }

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
        }
    };
}
