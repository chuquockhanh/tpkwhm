DROP TABLE IF EXISTS `userrole`;
CREATE TABLE `userrole` (
  `UserRoleID` BIGINT(11) NOT NULL AUTO_INCREMENT,
  `UserID` BIGINT(11) DEFAULT NULL,
  `RoleAnswer` TINYINT(4) DEFAULT NULL,
  PRIMARY KEY (`UserRoleID`),
  UNIQUE KEY `UserID_UNIQUE` (`UserID`),
	CONSTRAINT `FK_USERROLE_UserID` FOREIGN KEY (`UserID`) REFERENCES `User` (`UserID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
