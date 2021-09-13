import React, { useEffect } from 'react';
import axios from 'axios';
import { round } from 'utils/format'
import { useState } from 'react';
import Chart from 'react-apexcharts';
import { BASE_URL } from "utils/request";
import { SaleSucess } from 'types/sale';

type SeriesData = {
    name: string,
    data: number[];
}

type ChartData = {
    labels: {
        categories: string[],
    };
    series: SeriesData[];
}

const Barchart = () => {

    const [chartData, setChartData] = useState<ChartData>({
        labels: {
            categories: []
        },
        series: [
            {
                name: "",
                data: []                   
            }
    ]
        });

        useEffect(()=>{
            axios.get(`${BASE_URL}/sales/sucess-by-seller`).then( response =>{
                const data = response.data as SaleSucess[];
                const myLabels = data.map(x => x.sellerName);
                const myData = data.map(x => round(100.0 * x.deals / x.visited, 1));
                setChartData({ 
                    labels: {
                        categories: myLabels
                    },
                    series: [
                        {
                            name: "% de Sucesso",
                            data: myData                   
                        }
                ]

                })
                })
             }, []);

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };
    
    return (
       <Chart 
        options={{...options, xaxis: chartData.labels}}
        series={chartData.series}
        type="bar"
        height="240"
       /> 
    );
}

export default Barchart;