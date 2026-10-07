# Compte rendu — TP Application compteur

**Nom et prénom :** …
**Groupe :** …
**Date :** …

## 1. Travail réalisé

Application Android en Kotlin affichant un compteur initialisé à 0. Trois boutons
principaux modifient la valeur : `+` (incrémente de 1), `-` (décrémente de 1) et
`Réinitialiser` (remet à 0). L'interface est décrite dans `activity_main.xml`, la logique
dans `MainActivity.kt`, et tous les textes visibles sont déclarés dans `strings.xml`.

## 2. Organisation du code

- La variable `compteur` est déclarée comme propriété privée de l'activité, ce qui lui
  permet de survivre aux clics successifs.
- Les vues sont récupérées une seule fois dans `onCreate` avec `findViewById`.
- Une méthode unique `actualiserAffichage()` met à jour le `TextView` : l'affichage ne peut
  donc jamais se désynchroniser de la variable.

## 3. Résultats des tests

| Test | Résultat attendu | Observé |
|---|---|---|
| Démarrage | 0 | … |
| Premier clic sur + | 1 | … |
| Deuxième clic sur + | 2 | … |
| Clic sur - | 1 | … |
| Clic sur - jusqu'au négatif | valeur négative affichée | … |
| Clic sur Réinitialiser | 0 | … |

## 4. Difficultés rencontrées

*(à compléter — quelques pistes fréquemment rencontrées)*

- Synchronisation Gradle longue ou en échec au premier lancement (téléchargement des
  dépendances, nécessité d'une connexion stable).
- Démarrage lent de l'émulateur lorsque la virtualisation matérielle n'est pas activée
  dans le BIOS/UEFI.
- Erreur `lateinit property has not been initialized` lorsque `findViewById` est appelé
  avant `setContentView`.
- `NullPointerException` / vue introuvable en cas d'identifiant mal orthographié entre le
  layout et le code.
- Perte de la valeur du compteur lors de la rotation de l'écran, résolue avec
  `onSaveInstanceState`.

## 5. Conclusion

…
