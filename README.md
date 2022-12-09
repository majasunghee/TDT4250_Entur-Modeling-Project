# tdt4250 Semester Project 
*by group11:*
- Maja Sunghee Jenssen
- Ingvild Søvik
- Synne Jenssen
- Phajsi Halvorsen


## Description

This project was made to visualize some of the data found in [Entur's API](https://developer.entur.org/pages-journeyplanner-journeyplanner) Entur operates the national registry for all public transport in Norway. We chose to fetch the data on all public transport lines in Norway and data on details on some lines and operators. 

The data is fetched, deserialized and mapped to an Ecore model, this model is then visualized using the Sirius framework.

## Contents
- [Requirements](#Requirements)
- [Setup](#Setup)
- [Repository](#Repository)
- [Ecore Model](#Ecore model)
- [Sirius Viewpoints](#Sirius viewpoints)

## Requirements
- Ecore and Eclipse Modeling Framework
- Sirius:
  - Sirius Specifier Environment 
  - Sirius Properties Views
- Jackson
- Acceleo Query SDK
- Ecore Diagram Editor (SDK)
- PlantUML: 
  - PlantUML Ecore Feature
  - PlantUML Feature
  - PlantUML Library Feature

No additional plugins than those required for the TDT4250 course have been used.

## Setup

1. Clone the repo
```
git clone https://gitlab.stud.idi.ntnu.no/TDT4250/2022-projects/tdt4250-group11.git
```
2. 

The environment should be now ready to use.

## Repository
The repository is structured as follows:

:file_folder: tdt4250-group11 <br/>
&nbsp; :file_folder: tdt4250.entur.diagram <br/>
&nbsp; &nbsp; :file_folder: src <br/>
&nbsp; &nbsp; :file_folder: description <br/>
&nbsp; &nbsp;... <br/>

&nbsp; :file_folder: tdt4250.entur.model  <br/>
&nbsp; &nbsp; :file_folder: src <br/>
&nbsp; &nbsp; :file_folder: model <br/>
&nbsp; &nbsp; &nbsp; :page_facing_up: TransportModel.ecore <br/>
&nbsp; &nbsp; &nbsp; :page_facing_up: TransportModel.genmodel <br/>
&nbsp; &nbsp; &nbsp; :page_facing_up: TransportOrg.xmi <br/>
&nbsp; &nbsp; ... <br/>

&nbsp; :file_folder: tdt4250.entur.modelInstance  <br/>
&nbsp; &nbsp; :page_facing_up: representations.aird <br/>
&nbsp; &nbsp; :page_facing_up: TransportOrg.xmi <br/>
&nbsp; &nbsp; ... <br/>

&nbsp; :file_folder: tdt4250.entur.pluginProject  <br/>
&nbsp; &nbsp; :file_folder: src <br/>
&nbsp; &nbsp; &nbsp; :file_folder: data <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: OutputAllOperatorsData.json <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: OuputLinesData.json <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: OutputSpecificLinesData.json <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: TransportOrg.xmi <br/>
&nbsp; &nbsp; &nbsp; :file_folder: pojo <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: LinesClass.java <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: OperatorClass.java <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: SpecificLineClass.java <br/>
&nbsp; &nbsp; &nbsp; :file_folder: resources <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: Fetcher.java <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: ModelMapper.java <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: PojoMapper.java <br/>
&nbsp; &nbsp; ... <br/>

## Ecore model

## Fetching data and data mapping

## Sirius viewpoints


