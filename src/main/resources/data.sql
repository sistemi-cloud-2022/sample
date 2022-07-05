/*
    Insert static_age_unit records
*/
INSERT INTO `static_age_unit` (`id`, `name`)
VALUES (1,'Years'),(2,'Months'),(3,'Weeks'),(4,'Days');
/*
    Insert miabis_quantities records
*/
INSERT INTO `miabis_quantities` (`id`, `unit_of_measure`)
VALUES (1,'ml'),(2,'l'),(3,'g'),(4,'mg');
/*
    Insert miabis_sex records
*/
INSERT INTO `miabis_sex` (`id`, `name`, `definition`)
VALUES (1,'Male','Male.'),(2,'Female','Female.'),
	(3,'Unknown','A proper value is applicable but not known.'),
	(4,'Undifferentiated','Undifferentiated, the gender could not be uniquely identified such as hermaphrodite.');
/*
    Insert miabis_material_type records
*/
INSERT INTO `miabis_material_type` (`id`, `name`, `definition`)
VALUES
	(1,'Blood','Blood that has not been separated into its various components; blood that has not been modified except for the addition of an anticoagulant.'),
	(2,'DNA','A long linear double-stranded polymer formed from nucleotides attached to a deoxyribose backbone and found in the nucleus of a cell; associated with the transmission of genetic information.'),
	(3,'Faeces','The material discharged from the bowel during defecation. It consists of undigested food, intestinal mucus, epithelial cells, and bacteria.'),
	(4,'Immortalized Cell Lines','Cells of a single type (human, animal, or plant) that have been adapted to grow continuously in the laboratory and are used in research.'),
	(5,'Isolated Pathogen','An isolated biological agent causing disease; a disease producer e.g. virus, bacterium, prion, other microorganism etc.'),
	(6,'Other','Any other type of material taken from a biological entity, e.g. amniotic fluid, cerebrospinal fluid (CSV), mitochondrial RNA.'),
	(7,'Plasma','Plasma is the fluid (acellular) portion of the circulating blood, as distinguished from the serum that is the fluid portion of the blood obtained by removal of the fibrin clot and blood cells after coagulation.'),
	(8,'RNA','One of two types of nucleic acid made by cells. RNA contains information that has been copied from DNA (the other type of nucleic acid). Cells make several different forms of RNA, and each form has a specific job in the cell.'),
	(9,'Saliva','A clear liquid secreted into the mouth by the salivary glands and mucous glands of the mouth; moistens the mouth and starts the digestion of starches.'),
	(10,'Serum','The clear portion of the blood that remains after the removal of the blood cells and the clotting proteins.'),
	(11,'Tissue (Frozen)','An anatomical structure consisting of similarly specialized cells and intercellular matrix, aggregated according to genetically determined spatial relationships, performing a specific function.'),
	(12,'Tissue (FFPE)','Tissue, formalin fixated and paraffin preserved or equivalent.'),
	(13,'Urine','The fluid that is excreted by the kidneys. It is stored in the bladder and discharged through the urethra.');

/*
    Insert miabis_storage_temperature records
*/
INSERT INTO `miabis_storage_temperature` (`id`, `name`, `definition`)
VALUES
	(1,'RT','Room temperature'),
	(2,'2 °C to 10°C','Between 2 °C and 10 °C'),
	(3,'-18 °C to -35 °C','Between -18 °C and -35 °C'),
	(4,'-60 °C to -85 °C','Between -60 °C and -85 °C'),
	(5,'LN','Liquid Nitrogen, -150 °C to -196 °C'),
	(6,'Other','Any other temperature or long time storage information');
/*
    Insert sample_type records
*/
INSERT INTO `sample_type` (`id`, `tipo`, `denomination`, `acronym`)
VALUES
	(1,0,'Ascites Fluid','ASC'),
	(2,0,'Amniotic Fluid','AMN'),
	(3,0,'Bronchoalveolar Lavage','BAL'),
	(4,0,'Blood (whole)','BLD'),
	(5,0,'Bone Marrow Aspirate','BMA'),
	(6,0,'Breast Milk','BMK'),
	(7,0,'Buccal Cells','BUC'),
	(8,0,'Unficolled buffy coat, viable','BUF'),
	(9,0,'Unficolled buffy coat, non viable','BFF'),
	(10,0,'Ficoll mononuclear cells, viable','CEL'),
	(11,0,'Fresh cells from nonblooc specimen type','CEN'),
	(12,0,'Cells from nonblood speciment type (e.g., ascites, amniotic) viable','CLN'),
	(13,0,'Cord Blood','CSF'),
	(14,0,'Cerebrospinal Fluid','CSF'),
	(15,0,'Enriched (physichochemically) circulating tumor cells','CTC'),
	(16,0,'Dried whole blood (e.g., Gunthrie cards)','DWB'),
	(17,0,'Nasal Washing','NAS'),
	(18,0,'Ficoll mononuclear cells, nonviable','PEL'),
	(19,0,'Cells from nonblood specimen type (e.g, ascites, amniotic) nonviable','PEN'),
	(20,0,'Pleural Fluid','PFL'),
	(21,0,'Dental Pulp','PLP'),
	(22,0,'Plasma, single spun','PL1'),
	(23,0,'Plasma, double spun','PL2'),
	(24,0,'Red blood cells','RBC'),
	(25,0,'Saliva','SAL'),
	(26,0,'Semen','SEM'),
	(27,0,'Serum','SER'),
	(28,0,'Sputum','SPT'),
	(29,0,'Stool','STL'),
	(30,0,'Synovial Fluid','SYN'),
	(31,0,'Tears','TER'),
	(32,0,'24h Urine','U24'),
	(33,0,'Urine, random (\"spot\")','URN'),
	(34,0,'Urine, first morning','URM'),
	(35,0,'Urine, timed','URT'),
	(36,0,'Other','ZZZ'),
	(37,1,'Bone','BON'),
	(38,1,'Fresh cells from nonblood specimen type (e.g., biopsy)','CEN'),
	(39,1,'Cells from nonblood specimen type (e.g., dissociated tissue), viable','CLN'),
	(40,1,'Cells from fine needle aspirate','FNA'),
	(41,1,'Hair','HAR'),
	(42,1,'Cells from lase capture microdissected tissue','LCM'),
	(43,1,'Nails','NAL'),
	(44,1,'Cells from nonblood specimen type (e.g., dissociated tissue), nonviable','PEN'),
	(45,1,'Placenta','PLC'),
	(46,1,'Solid Tissue','TIS'),
	(47,1,'Disrupted tissue, nonviable','TCM'),
	(48,1,'Teeth','TTH'),
	(49,1,'Other','ZZZ');

/*
    Insert sample records
*/
INSERT INTO `sample` (`id`, `user_id`, `box_id`, `donor_id`, `consent_id`, `sample_id`, `location_id`, `location_path`, `parent_sample_id`, `type_id`, `sprec`, `sampling_technique`, `storage_temperature`, `sampled_time`, `anatomycal_site`, `residual_quantity`, `um_id`)
VALUES
	(1,1,NULL,30,NULL,'SA903F94462','9','Freezer 1/Division 1/Drawer 1/Slot 3',NULL,39,'CLN-A12-B-B-ACA-G-T',NULL,1,'2018-05-25 15:12:00',NULL,150.00,1),
	(2,1,NULL,NULL,NULL,'SC7D2A18B40','7','Freezer 1/Division 1/Drawer 1/Slot 1',NULL,38,'CEN-A06-B-B-ALL-B-D',NULL,1,'2019-08-08 09:00:00','ddd',NULL,1),
	(3,NULL,1,NULL,NULL,'SCB56E14484','7','Freezer 1/Division 1/Drawer 1/Slot 1',NULL,2,'AMN-ADD-J-N-N-J-N',NULL,NULL,NULL,NULL,NULL,1),
	(4,NULL,1,22,1,'S89A9AC7486','2','Freezer 2',NULL,39,NULL,'klòkokpèok',2,NULL,NULL,NULL,3),
	(5,NULL,1,NULL,NULL,'S8B94326D91',NULL,NULL,NULL,2,'AMN-ACD-N-J-N-J-N',NULL,NULL,NULL,NULL,NULL,NULL),
	(6,NULL,1,NULL,NULL,'SFB2CAB69B5',NULL,NULL,NULL,2,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
	(7,1,NULL,NULL,NULL,'S73525269DD','2','Freezer 2',NULL,2,NULL,NULL,1,'2019-01-01 00:00:00',NULL,NULL,1),
	(8,1,NULL,24,NULL,'S82C2BF4479','2','Freezer 2',NULL,3,NULL,NULL,2,'2018-05-25 15:12:00',NULL,NULL,1),
	(9,1,NULL,25,NULL,'S956A6E8C82','2','Freezer 2',NULL,38,NULL,NULL,2,'2018-05-25 15:12:00',NULL,NULL,1),
	(10,1,NULL,26,NULL,'S64A719ECA1','2','Freezer 2',NULL,38,NULL,NULL,1,'2019-02-04 00:00:00',NULL,NULL,1),
	(11,1,NULL,NULL,NULL,'SC7F2017DE8','2','Freezer 2',NULL,38,NULL,NULL,5,'2019-01-01 00:01:00',NULL,NULL,1);

/*
    Insert colletions records
*/
INSERT INTO `collections` (`id`, `name`, `acronym`, `description`, `sex_id`, `age_low`, `age_high`, `age_unit_id`, `material_type_id`, `note`)
VALUES
	(1,'prova',NULL,NULL,2,NULL,NULL,1,2,NULL),
	(2,'test','tst','AD:test di giorno 30/09/2019',1,28,29,1,4,'test'),
	(3,'prova','tst',NULL,2,8,5,1,10,NULL),
	(4,'v','vvvv','vvvvv',1,2,34,1,11,'vvvv');

/*
    Insert colletions_samples records
*/
INSERT INTO `collections_samples` (`id`, `sample_id`, `collection_id`)
VALUES
	(3,5,1),(4,6,1),(5,2,1),(6,1,2),(7,3,2),(8,7,2),
	(10,4,1),(11,4,1),(12,4,1),(13,4,1),(14,4,1),
	(15,1,2),(16,8,3),(17,10,3);
