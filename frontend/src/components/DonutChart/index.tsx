import axios from "axios";
import React from "react";
import Chart from "react-apexcharts";
import { BASE_URL } from "utils/request";
import { SaleSum} from 'types/sale';


type ChartData = {
    labels: string[],
    series: number[]
}


const Donutchart = () => {

    let chartData : ChartData = {labels:[], series:[]};

    axios.get(`${BASE_URL}/sales/sum-by-seller`).then( response =>{
                    const data = response.data as SaleSum[];
                    const myLabels = data.map(x => x.sellerName);
                    const mySeries = data.map(x => x.sum);
                    chartData = {labels: myLabels, series:mySeries}
                    console.log(response.data)
                    })
    
     const mockData = {
        series: [],
        labels: []
     }

    const options = {
        legend: {
            show: true
        }
    }
    
    return (
        <Chart 
            options={{...options, labels: mockData.labels}}
            series={mockData.series}
            type="donut"
            height="240"
        />
    )
}

export default Donutchart;