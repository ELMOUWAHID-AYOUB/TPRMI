# TPRMI

Définition:

RMI en Java signifie "Remote Method Invocation" (Invocation de méthode à distance). C'est une technologie qui permet à un programme Java sur une machine virtuelle Java (JVM) d'appeler des méthodes d'objets résidant dans une autre JVM, que ce soit sur la même machine ou sur une machine distante.

RMI est une forme de communication inter-processus en réseau où les méthodes d'un objet Java peuvent être appelées depuis un autre objet sur une machine virtuelle Java, comme si cet objet était sur la même machine. Cela permet aux développeurs de créer des applications distribuées en Java relativement facilement, en masquant une grande partie de la complexité sous-jacente de la communication en réseau.

TP Réalise a l'aide de RMI:

**Interface gestion des machines**:

*Ajouté une machine:

![ba](https://github.com/ELMOUWAHID-AYOUB/HibernateTP/assets/130571009/b74a3748-0a2f-4583-b888-fd4b45658315)


*Modifié une machine:


Alerte de moification:

![AM](https://github.com/ELMOUWAHID-AYOUB/HibernateTP/assets/130571009/7d69798c-3a9d-4e9d-8a7d-9108391ecf0b)

la modification d'une machine:

![Capture d’écran 2023-10-23 202336](https://github.com/ELMOUWAHID-AYOUB/HibernateTP/assets/130571009/658e826a-727f-4947-b54b-263e8061a52b)

*Supprimé une machine:

Alerte de suppression:

![ASUPP](https://github.com/ELMOUWAHID-AYOUB/HibernateTP/assets/130571009/da053b12-e283-4f01-9aa2-73a21b893e31)

la suppression d'une machine:
![Supp](https://github.com/ELMOUWAHID-AYOUB/HibernateTP/assets/130571009/c1dd8205-fad5-4ce3-98a6-090c7881624a)

**Interface gestion des salles**:

*Ajouté une salle:

![BienAjouter](https://github.com/ELMOUWAHID-AYOUB/HibernateTP/assets/130571009/4e15825e-9fd5-4161-a946-4111f41d2288)

*Supprimé une salle:

Alerte de suppression:

![SuppSalle](https://github.com/ELMOUWAHID-AYOUB/HibernateTP/assets/130571009/b9c1cea0-654a-444e-8bc3-ce0ca353858c)

la supression d'une salle:

![biensuppsssss](https://github.com/ELMOUWAHID-AYOUB/HibernateTP/assets/130571009/79880817-9826-4d6c-8c15-851b7c5ab46d)

*Modifié une salle:


Alerte de moification:


![ALERTmodifSSS](https://github.com/ELMOUWAHID-AYOUB/HibernateTP/assets/130571009/145a84c3-3e5c-4ab8-a043-8343fbf65c48)



la modification d'une salle:

![bienmodifieSS](https://github.com/ELMOUWAHID-AYOUB/HibernateTP/assets/130571009/f31625d9-01d7-47d9-94cb-df10682c4b8b)


**BASE DE DONNES:


![basetout](https://github.com/ELMOUWAHID-AYOUB/HibernateTP/assets/130571009/1360444d-48ee-4390-8133-4eb20aa4af8f)


-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 23 oct. 2023 à 21:31
-- Version du serveur : 10.4.27-MariaDB
-- Version de PHP : 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `dbmachine`
--

-- --------------------------------------------------------

--
-- Structure de la table `machine`
--

CREATE TABLE `machine` (
  `id` int(11) NOT NULL,
  `marque` varchar(255) DEFAULT NULL,
  `prix` double NOT NULL,
  `ref` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `machine`
--

INSERT INTO `machine` (`id`, `marque`, `prix`, `ref`) VALUES
(2, 'HP', 10000, 'ETR'),
(3, 'dell', 10000, 'elite'),
(4, 'lenovo', 100, 'elite'),
(5, 'infinix', 2000, '30i');

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

CREATE TABLE `salle` (
  `id` int(11) NOT NULL,
  `code` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `machine`
--
ALTER TABLE `machine`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `salle`
--
ALTER TABLE `salle`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `machine`
--
ALTER TABLE `machine`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `salle`
--
ALTER TABLE `salle`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
**Technologies Utilisées**

Java:Java est un langage de programmation polyvalent et orienté objet largement utilisé pour développer diverses applications allant des applications de bureau aux applications Web en passant par les applications mobiles. Il est apprécié pour sa portabilité, sa robustesse, sa sécurité et sa facilité d'utilisation.

MySQL :MySQL est un système de gestion de base de données relationnelle open source populaire. Il est largement utilisé pour stocker, organiser et gérer de grandes quantités de données de manière efficace et fiable. Il offre une grande stabilité, une bonne performance et une large gamme de fonctionnalités, en faisant un choix populaire pour de nombreux types d'applications.

Hibernate :Hibernate est un framework de mapping objet-relationnel (ORM) en Java qui simplifie considérablement la communication entre une application Java et une base de données relationnelle. Il permet aux développeurs de travailler avec des objets Java au lieu de requêtes SQL directes, ce qui rend le processus de persistance des données plus simple et plus flexible.

RMI :  RMI est un mécanisme en Java qui permet à un objet d'appeler des méthodes sur un objet distant. Il facilite la communication entre les applications Java s'exécutant sur différentes machines virtuelles Java (JVM) en permettant l'invocation de méthodes sur des objets distants comme s'ils étaient des objets locaux. Cela simplifie la mise en œuvre de l'interaction client-serveur dans les applications distribuées.


**CONCLUSION:**

 ce projet de gestion de salles et d'équipements, développé en utilisant Hibernate, RMI et Java Swing, vise à faciliter la procédure de réservation des ressources. Son interface conviviale, la gestion persistante des données via Hibernate, ainsi que la communication fluide permise par RMI, en font une solution précieuse pour améliorer l'efficacité des opérations.
