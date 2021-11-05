import React from "react";
import Navbar from '../../components/Navbar';
import Footer from '../../components/Footer';
import DataTable from '../../components/DataTable';
import Barchart from '../../components/BarChart';
import Donutchart from '../../components/DonutChart'

const DashBoard = () => {
    return (
        <>
            <Navbar />
            <div className="container">
                <h2 className="text-primary py-3">DashBoard de Vendas</h2>
                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Taxa de Sucesso (%)</h5>
                        <Barchart />
                    </div>

                    <div className="col-sm-6">
                        <h5 className="text-center text-secondary">Todas as Vendas</h5>
                        <Donutchart />
                    </div>
                </div>
            
                <h2 className="text-primary py-3">Todas as Vendas</h2>
                <DataTable />
            
            </div>
            <Footer />
        </>
    );
}

export default DashBoard;