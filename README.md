# tdt4250 Semester Project 
*by group11:*
- Maja Sung Hee Jenssen
- Ingvild Søvik
- Synne Jenssen
- Phajsi Halvorsen


## Description

This project was made to visualize some of the data found in [Entur's API](https://developer.entur.org/pages-journeyplanner-journeyplanner). Entur operates the national registry for all public transport in Norway. We chose to fetch the data on all public operators and transport lines in Norway, as well as detailed data for some lines. This includes information about the routes a line is responsible for.

The data is fetched, deserialized and mapped to an Ecore model. This model is then visualized using the Sirius framework.

## Contents
- [Requirements](#Requirements)
- [Setup](#Setup)
- [How to run the project](#How to run the project)
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

1. Clone the repository
```
git clone https://gitlab.stud.idi.ntnu.no/TDT4250/2022-projects/tdt4250-group11.git
```

The environment should now be ready to use.

## How to run the project
**The project is already set up so that anyone can simply clone it and start making views in Sirius. See the Readme.md file linked to in the subsection [Sirius viewpoints](#Sirius viewpoints) on how to generate and view the different tables and diagrams.**

In general, the project can be updated/run in the following way:

1. Run Fetcher.java in tdt4250.entur.pluginProject to update data in json files.
2. Run ModelMapper.Java in tdt4250.entur.pluginProject to set the updated data to the xmi-file.
3. Replace the xmi-file in tdt4250.entur.modelInstance with the newly generated xmi from pluginProject.
4. Generate views (tables and diagrams) of the data.

## Repository
The repository is structured as shown below. Each bundle contains its own Readme.md file with information about the contents of the bundle. 

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
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: OutputRoutesInLine.json <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: TransportOrg.xmi <br/>
&nbsp; &nbsp; &nbsp; :file_folder: pojo <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: LinesClass.java <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: OperatorClass.java <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: RoutesInLine.java <br/>
&nbsp; &nbsp; &nbsp; :file_folder: resources <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: Fetcher.java <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: ModelMapper.java <br/>
&nbsp; &nbsp; &nbsp; &nbsp; :page_facing_up: PojoMapper.java <br/>
&nbsp; &nbsp; ... <br/>

## Ecore model
[Redirect to Readme in Model bundle](./tdt4250.entur.model/)

## Fetching data and data mapping
[Redirect to Readme in Plugin Project bundle](./tdt4250.entur.pluginProject/)

## Sirius viewpoints
[Redirect to Readme in Model Instance bundle](./tdt4250.entur.modelInstance/)
