# Système de réservation de salles (version console)

Projet personnel en Java : un programme en console pour gérer des salles,
des utilisateurs et des réservations.

## Fonctionnalités

Déjà réalisé :
- Classes `Salle`, `Utilisateur` (avec un rôle : utilisateur ou administrateur)
  et `Reservation`
- Identifiants générés automatiquement
- Validation des données (capacité positive, email valide, heure de fin après
  l'heure de début)
- Détection du chevauchement de deux réservations
- Stockage des données dans des `ArrayList`

À venir :
- Ajout, affichage et annulation des réservations
- Refus d'une réservation si la salle est déjà prise sur ce créneau
- Menu en console, gestion des erreurs et sauvegarde dans un fichier texte

## Technologies

- Java (JDK 25)
- IntelliJ IDEA

## Structure du projet

- `Salle`, `Utilisateur`, `Reservation` : les classes du domaine
- `Role` : énumération des rôles (UTILISATEUR, ADMINISTRATEUR)
- `GestionReservations` : stockage et gestion des données
- `Main` : point de départ du programme

## Lancer le projet

1. Ouvrir le dossier du projet dans IntelliJ IDEA
2. Exécuter la classe `Main`

## Avancement

- [x] Semaine 1 : conception et création des classes
- [ ] Semaine 2 : fonctionnalités
- [ ] Semaine 3 : menu, gestion des erreurs et sauvegarde

## Auteur

Sara MEKKAOUI