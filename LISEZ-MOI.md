# TP Android Studio — Application compteur

Projet **CompteurAndroid** (Kotlin, Empty Views Activity, minSdk 24).

## Ouvrir le projet

1. Décompresser l'archive.
2. Dans Android Studio : *File → Open…* puis choisir le dossier `CompteurAndroid`.
3. Laisser la synchronisation Gradle se terminer (connexion Internet nécessaire au premier lancement).
   Android Studio propose de générer le *Gradle Wrapper* manquant : accepter.
4. Sélectionner un AVD (API 24 ou plus) puis cliquer sur **Run**.

> Si Android Studio signale une version d'AGP différente, accepter la mise à jour proposée
> (*AGP Upgrade Assistant*) ou ajuster les versions dans `build.gradle.kts`.

## Fichiers demandés par l'énoncé

| Fichier | Emplacement |
|---|---|
| `activity_main.xml` | `app/src/main/res/layout/` |
| `MainActivity.kt` | `app/src/main/java/tn/exemple/compteurandroid/` |
| `strings.xml` | `app/src/main/res/values/` |

## Ce qui est implémenté

- Titre, valeur du compteur, boutons `+`, `-`, `Réinitialiser`.
- Variable `compteur` initialisée à 0, affichage toujours synchronisé avec la variable.
- Tous les textes visibles sont dans `strings.xml`.
- Identifiants imposés : `textViewCompteur`, `buttonIncrementer`, `buttonDecrementer`, `buttonReinitialiser`.

### Améliorations facultatives réalisées

- Couleur de la valeur : vert si positive, rouge si négative, noir si nulle (`colors.xml`).
- Boutons `+5` et `-5`.
- Message *Toast* lors de la réinitialisation.
- Conservation de la valeur après rotation de l'écran (`onSaveInstanceState`).

L'amélioration « empêcher les valeurs négatives » n'a pas été activée, car le test demandé
exige que le compteur puisse afficher une valeur négative.

## À compléter avant de remettre

- La capture d'écran de l'application en fonctionnement (à prendre depuis l'émulateur).
- Le fichier `COMPTE_RENDU.md` (nom, prénom, groupe et difficultés rencontrées).
