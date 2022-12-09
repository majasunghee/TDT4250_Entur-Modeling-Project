# Plugin Project Readme
The plugin project uses the ecore model from the tdt4250.entur.model bundle. It contains all logic related to fetching, deserializing and mapping data to the model.

## Repository
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


- Data folder
    - This folder contains json files for the data that is being fetched. The json files will be created/updated when running the Fetcher.java class. The data folder also contains the xmi-file which is created/updated when running the ModelMapper.java class.
- Pojo folder
    - Contains plain old Java objects (POJO) for Lines, Operators and Routes in a line.
- Resources folder
    - Fetcher.java contains logic for fetching data from Entur's API.
    - PojoMapper.java contains logic for storing data from the json files in the POJOs.
    - ModelMapper.java creates new instances of the classes in the ecore model and sets data from the POJOs to the model.
